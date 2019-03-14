package n.Command;

class CommandImpl extends Command{

    private Receiver receiver;
    public CommandImpl(Receiver receiver) {
        super(receiver);
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.receive();
        System.out.println("命令被执行了");
    }
}
