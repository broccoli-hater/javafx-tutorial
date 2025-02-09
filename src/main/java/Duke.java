public class Duke {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }

    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        return "Duke heard: " + input;
    }

//    private String commandType;
//    public String getResponse(String input) {
//        try {
//            Command c = Parser.parse(input);
//            c.execute(tasks, ui, storage);
//            commandType = c.getClass().getSimpleName();
//            return c.getString();
//        } catch (DukeException e) {
//            return "Error: " + e.getMessage();
//        }
//    }
//    public String getCommandType() {
//        return commandType;
//    }
}
