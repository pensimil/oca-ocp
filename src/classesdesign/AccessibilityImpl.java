package classesdesign;

public class AccessibilityImpl extends TestAccess implements Accessibility {
    @Override
    public void a() {

    }

    @Override
    protected String as() {
        return super.as();
    }
}

class TestAccess {
    protected String as() {
        return "as";
    }
}
