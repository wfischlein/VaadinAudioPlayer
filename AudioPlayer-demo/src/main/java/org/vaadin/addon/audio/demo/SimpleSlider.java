package org.vaadin.addon.audio.demo;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * A Designer generated component for the simple-slider template.
 *
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Tag("simple-slider")
@HtmlImport("simple-slider.html")
public class SimpleSlider extends PolymerTemplate<SimpleSlider.SimpleSliderModel> {

    @Id("caption")
    private Label caption;
    @Id("slider")
    private PaperSlider slider;

    public static final int SCALE_MULTIPLIER = 100;

    /**
     * Creates a new SimpleSlider.
     */
    public SimpleSlider() {
        // You can initialise any data required for the connected UI components here.
    }

    public void setMinValue(double min) {
        getElement().setProperty("min", min * SCALE_MULTIPLIER);
    }

    public void setMaxValue(double max) {
        getElement().setProperty("max", max * SCALE_MULTIPLIER);
    }


    /**
     * This model binds properties between SimpleSlider and simple-slider
     */
    public interface SimpleSliderModel extends TemplateModel {

    }
}
