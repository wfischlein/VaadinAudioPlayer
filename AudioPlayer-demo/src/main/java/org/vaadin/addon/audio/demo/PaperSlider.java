package org.vaadin.addon.audio.demo;

import com.vaadin.flow.component.AbstractSinglePropertyField;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.HasSize;
import com.vaadin.flow.component.HasStyle;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;

@Tag("paper-slider")
@HtmlImport("bower_components/paper-slider/paper-slider.html")
public class PaperSlider extends AbstractSinglePropertyField<PaperSlider, Integer>
        implements HasElement, HasSize, HasStyle {

    public static final int SCALE_MULTIPLIER = 100;

    public PaperSlider() {
        super("value", 0, false);
    }

    public PaperSlider(double min, double max, int initial) {
        super("value", initial * 1, false);
        getElement().setProperty("max", max * SCALE_MULTIPLIER);
        getElement().setProperty("min", min * SCALE_MULTIPLIER);
        getStyle().set("width", "100px");
    }

    public void setMinValue(double min) {
        getElement().setProperty("min", min * SCALE_MULTIPLIER);
    }

    public void setMaxValue(double max) {
        getElement().setProperty("max", max * SCALE_MULTIPLIER);
    }

    @Override
    public void setValue(Integer value) {
        getElement().setProperty("value", value * 100);
    }

    @Override
    public Integer getValue() {
        return Integer.parseInt(getElement().getProperty("value")) / SCALE_MULTIPLIER;
    }
}
