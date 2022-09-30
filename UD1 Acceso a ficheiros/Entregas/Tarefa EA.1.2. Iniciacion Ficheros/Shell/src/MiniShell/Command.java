package MiniShell;

interface Command {
    static Command getCmd(String op) {
        Command cmd;

        switch (op) {
            case "cd" -> cmd = new CdCmd();
            case "ls" -> cmd = new LsCmd();
            case "cat" -> cmd = new CatCmd();
            case "clear" -> cmd = new ClearCmd();
            default -> cmd = null;
        }

        return cmd;
    }
    boolean prepare(String[] args);
    String getUsage();
    void exec();
}
