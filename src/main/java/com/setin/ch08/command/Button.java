package com.setin.ch08.command;

/**
 * Created by 두석 on 2016-06-25.
 */
public class Button {
    private Command theCommand;

    public Button(Command theCommand) {
        setCommand(theCommand);

    }


    public void setCommand(Command command) {
        this.theCommand = command;
    }

    public void pressed() {
        theCommand.execute();
    }
}
