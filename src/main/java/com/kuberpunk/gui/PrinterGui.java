package com.kuberpunk.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;

public class PrinterGui extends LightweightGuiDescription {
    public PrinterGui() {
        WGridPanel root = new WGridPanel();
        setRootPanel(root);

        root.setSize(300, 200);
    }
}
