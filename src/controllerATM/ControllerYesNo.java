package controllerATM;

import viewATM.ViewYesNo;

public class ControllerYesNo extends ControllerScreen {
    private ViewYesNo viewYesNo;
    private ControllerWithDrawal2 controllerWithDrawal2;

    public ControllerYesNo(ViewYesNo viewYesNo, ControllerWithDrawal2 controllerWithDrawal2) {
        this.viewYesNo = viewYesNo;
        this.controllerWithDrawal2 = controllerWithDrawal2;
    }

    @Override
    public void actionOnBtnLeftMid() {
        controllerWithDrawal2.doWithdraw();
    }

    @Override
    public void actionOnBtnRightMid() {
        controllerWithDrawal2.doWithdraw();
    }

    @Override
    public void actionOnBtnRightBot() {
        controllerWithDrawal2.getControllerLayout().endTransaction();
    }
}
