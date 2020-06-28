package Model;

import Interface.ISecurityUI;

public class PinCodeCheck {
    private ISecurityUI securityUI;

    public PinCodeCheck(ISecurityUI securityUI) {
        this.securityUI = securityUI;
    }

    private boolean isValid(int pin) {
        return true;
    }

    public boolean ValidateUser() {
        int pin = securityUI.RequestPinCode();
        if(isValid(pin)) {
            return true;
        }
        return false;
    }
}
