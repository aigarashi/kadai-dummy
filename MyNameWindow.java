import objectdraw.*;
import java.awt.*;

public class MyNameWindow extends WindowController {

    @Override public void onMousePress( Location point ) {
        new Text("REPLACE WITH YOUR NAME", 40, 50, canvas );
    }

    @Override public void onMouseRelease( Location point ) {
        canvas.clear();
    }
}
