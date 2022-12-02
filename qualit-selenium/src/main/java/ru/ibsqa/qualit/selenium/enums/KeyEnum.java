package ru.ibsqa.qualit.selenium.enums;

import java.awt.event.KeyEvent;

public enum KeyEnum {
    ENTER(KeyEvent.VK_ENTER),
    HOME(KeyEvent.VK_HOME),
    END(KeyEvent.VK_END),
    PAGE_UP(KeyEvent.VK_PAGE_UP),
    PAGE_DOWN(KeyEvent.VK_PAGE_DOWN),
    PLUS(KeyEvent.VK_ADD),
    ADD(KeyEvent.VK_ADD),
    MINUS(KeyEvent.VK_MINUS),
    MULTIPLY(KeyEvent.VK_MULTIPLY),
    SUBTRACT(KeyEvent.VK_SUBTRACT),
    DIVIDE(KeyEvent.VK_DIVIDE),
    DECIMAL(KeyEvent.VK_DECIMAL),
    SEPARATOR(KeyEvent.VK_SEPARATOR),
    SEMICOLON(KeyEvent.VK_SEMICOLON),
    EQUALS(KeyEvent.VK_EQUALS),
    PERIOD(KeyEvent.VK_PERIOD),
    SLASH(KeyEvent.VK_SLASH),
    BACK_SLASH(KeyEvent.VK_BACK_SLASH),
    COMMA(KeyEvent.VK_COMMA),
    CANCEL(KeyEvent.VK_CANCEL),
    CLEAR(KeyEvent.VK_CLEAR),
    PAUSE(KeyEvent.VK_PAUSE),
    OPEN_BRACKET(KeyEvent.VK_OPEN_BRACKET),
    CLOSE_BRACKET(KeyEvent.VK_CLOSE_BRACKET),
    CAPS_LOCK(KeyEvent.VK_CAPS_LOCK),
    NUM_LOCK(KeyEvent.VK_NUM_LOCK),
    SCROLL_LOCK(KeyEvent.VK_SCROLL_LOCK),
    PRINTSCREEN(KeyEvent.VK_PRINTSCREEN),
    HELP(KeyEvent.VK_HELP),
    META(KeyEvent.VK_META),
    BACK_QUOTE(KeyEvent.VK_BACK_QUOTE),
    QUOTE(KeyEvent.VK_QUOTE),
    UP(KeyEvent.VK_UP),
    DOWN(KeyEvent.VK_DOWN),
    LEFT(KeyEvent.VK_LEFT),
    RIGHT(KeyEvent.VK_RIGHT),
    TAB(KeyEvent.VK_TAB),
    ALT(KeyEvent.VK_ALT),
    CTRL(KeyEvent.VK_CONTROL),
    SHIFT(KeyEvent.VK_SHIFT),
    WIN(KeyEvent.VK_WINDOWS),
    ESCAPE(KeyEvent.VK_ESCAPE),
    SPACE(KeyEvent.VK_SPACE),
    BACK_SPACE(KeyEvent.VK_BACK_SPACE),
    INSERT(KeyEvent.VK_INSERT),
    DELETE(KeyEvent.VK_DELETE),
    F1(KeyEvent.VK_F1),
    F2(KeyEvent.VK_F2),
    F3(KeyEvent.VK_F3),
    F4(KeyEvent.VK_F4),
    F5(KeyEvent.VK_F5),
    F6(KeyEvent.VK_F6),
    F7(KeyEvent.VK_F7),
    F8(KeyEvent.VK_F8),
    F9(KeyEvent.VK_F9),
    F10(KeyEvent.VK_F10),
    F11(KeyEvent.VK_F11),
    F12(KeyEvent.VK_F12),
    KEY0(KeyEvent.VK_0),
    KEY1(KeyEvent.VK_1),
    KEY2(KeyEvent.VK_2),
    KEY3(KeyEvent.VK_3),
    KEY4(KeyEvent.VK_4),
    KEY5(KeyEvent.VK_5),
    KEY6(KeyEvent.VK_6),
    KEY7(KeyEvent.VK_7),
    KEY8(KeyEvent.VK_8),
    KEY9(KeyEvent.VK_9),
    NUMPAD0(KeyEvent.VK_NUMPAD0),
    NUMPAD1(KeyEvent.VK_NUMPAD1),
    NUMPAD2(KeyEvent.VK_NUMPAD2),
    NUMPAD3(KeyEvent.VK_NUMPAD3),
    NUMPAD4(KeyEvent.VK_NUMPAD4),
    NUMPAD5(KeyEvent.VK_NUMPAD5),
    NUMPAD6(KeyEvent.VK_NUMPAD6),
    NUMPAD7(KeyEvent.VK_NUMPAD7),
    NUMPAD8(KeyEvent.VK_NUMPAD8),
    NUMPAD9(KeyEvent.VK_NUMPAD9),
    A(KeyEvent.VK_A),
    B(KeyEvent.VK_B),
    C(KeyEvent.VK_C),
    D(KeyEvent.VK_D),
    E(KeyEvent.VK_E),
    F(KeyEvent.VK_F),
    G(KeyEvent.VK_G),
    H(KeyEvent.VK_H),
    I(KeyEvent.VK_I),
    J(KeyEvent.VK_J),
    K(KeyEvent.VK_K),
    L(KeyEvent.VK_L),
    M(KeyEvent.VK_M),
    N(KeyEvent.VK_N),
    O(KeyEvent.VK_O),
    P(KeyEvent.VK_P),
    Q(KeyEvent.VK_Q),
    R(KeyEvent.VK_R),
    S(KeyEvent.VK_S),
    T(KeyEvent.VK_T),
    U(KeyEvent.VK_U),
    V(KeyEvent.VK_V),
    W(KeyEvent.VK_W),
    X(KeyEvent.VK_X),
    Y(KeyEvent.VK_Y),
    Z(KeyEvent.VK_Z),
    ;

    private int value;

    KeyEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}