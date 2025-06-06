package org.jabref.gui.openoffice;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.Node;

import org.jabref.gui.icon.IconTheme;
import org.jabref.logic.openoffice.style.JStyle;

public class JStyleSelectViewModel {

    private final StringProperty name = new SimpleStringProperty("");
    private final StringProperty journals = new SimpleStringProperty("");
    private final StringProperty file = new SimpleStringProperty("");
    private final ObjectProperty<Node> icon = new SimpleObjectProperty<>(IconTheme.JabRefIcons.DELETE_ENTRY.getGraphicNode());
    private final JStyle jStyle;
    private final BooleanProperty internalStyle = new SimpleBooleanProperty();

    public JStyleSelectViewModel(String name, String journals, String file, JStyle jStyle) {
        this.name.setValue(name);
        this.journals.setValue(journals);
        this.file.setValue(file);
        this.jStyle = jStyle;
        this.internalStyle.set(jStyle.isInternalStyle());
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty journalsProperty() {
        return journals;
    }

    public ObjectProperty<Node> iconProperty() {
        return icon;
    }

    public StringProperty fileProperty() {
        return file;
    }

    public JStyle getJStyle() {
        return jStyle;
    }

    public BooleanProperty internalStyleProperty() {
        return internalStyle;
    }

    public String getStylePath() {
        return jStyle.getPath();
    }
}
