package com.telek.gt.decorator;

import com.telek.gt.Component;

public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component){
        this.component = component;
    }
    @Override
    public void display() {
        component.display();
    }
}
