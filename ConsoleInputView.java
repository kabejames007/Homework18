package edu.dmacc.codedsm.hw18;

public class ConsoleInputView implements InputView {

    private Result result;

    public ConsoleInputView(Result result) {
        this.result = result;
    }

    @Override
    public void render() {
        System.out.println("result = "+ result);
    }
}
