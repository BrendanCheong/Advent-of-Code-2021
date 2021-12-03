public class Submarine {

    private int vertical;
    private int horizontal;
    private int aim;
    private boolean part2;

    public Submarine(int vertical, int horizontal, int aim, boolean part2) {
        this.vertical = vertical;
        this.horizontal = horizontal;
        this.aim = aim;
        this.part2 = part2;
    }

    public void move(String instruction) {
        String[] splited = instruction.split("\\s+");
        int value = Integer.parseInt(splited[1]);
        switch(splited[0]) {
            case("forward"):
                this.horizontal += value;
                if (this.part2) {
                    this.vertical += this.aim * value;
                }
                break;
            case("up"):
                if (this.part2 && this.aim != 0) {
                    this.aim -= value;
                } else {
                    this.vertical -= value;
                }
                break;
            default:
                if (this.part2) {
                    this.aim += value;
                } else {
                    this.vertical += value;
                }
                break;
        }
    }

    public int finalDepth() {
        return this.horizontal * this.vertical;
    }

}