package com.artem.htmleditor.actions;

import com.artem.htmleditor.View;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Класс возврата действия RedoAction
 */
public class RedoAction extends AbstractAction {

    private View view;

    public RedoAction(View view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        view.redo();
    }
}