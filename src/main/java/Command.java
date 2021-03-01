public interface Command {

    // COMMAND Interface usually just declares a single method but in this case also the undo method

    void execute();
    void undo();

}
