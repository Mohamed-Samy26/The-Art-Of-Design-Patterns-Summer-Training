// Abstract Product - Button
interface Button {
    void render();
}

// Abstract Product - Checkbox
interface Checkbox {
    void render();
}
// Concrete Product - Windows Button
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows |button|");
    }
}

// Concrete Product - macOS Button
class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("macOS (button).");
    }
}



// Concrete Product - Windows Checkbox
class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Windows checkbox ✅");
    }
}

// Concrete Product - macOS Checkbox
class MacOSCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("macOS checkbox ☑️");
    }
}

// Abstract Factory
interface UIElementFactory {
    Button createButton();
    Checkbox createCheckbox();
}

// Concrete Factory - Windows UI Elements
class WindowsUIElementFactory implements UIElementFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}

// Concrete Factory - macOS UI Elements
class MacOSUIElementFactory implements UIElementFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}

// Client code
public class AbstractFactoryHandsOn {
    public static void main(String[] args) {
        UIElementFactory uiFactory = null;
        
        // select uiFactory based on OS
        if (isWindows) {
            uiFactory = new WindowsUIElementFactory();
        } else if (isMacOS) {
            uiFactory = new MacOSUIElementFactory();
        } else {
            throw new Exception("Unknown operating system.");
        }

        Button btn = uiFactory.createButton();
        btn.render(); 
        // Output: Windows |button| or macOS (button) depending on the OS.
        Checkbox chk = uiFactory.createCheckbox();
        chk.render();
        // Output: Windows checkbox ✅ or macOS checkbox ☑️ depending on the OS.
    }
}