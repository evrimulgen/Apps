package org.swt.layouts;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class SwtGridLayout {
	public static void main(String[] args) {
	    Display display = new Display();
	    Shell shell = new Shell(display);
	    GridLayout layout = new GridLayout(4, false);
	    shell.setLayout(layout);

	    Button b = new Button(shell, SWT.PUSH);
	    b.setText("LEFT, TOP");
	    b.setLayoutData(new GridData(SWT.LEFT, SWT.TOP, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("LEFT, CENTER");
	    b.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("LEFT, BOTTOM");
	    b.setLayoutData(new GridData(SWT.LEFT, SWT.BOTTOM, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("LEFT, FILL");
	    b.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("CENTER, TOP");
	    b.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("CENTER, CENTER");
	    b.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("CENTER, BOTTOM");
	    b.setLayoutData(new GridData(SWT.CENTER, SWT.BOTTOM, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("CENTER, FILL");
	    b.setLayoutData(new GridData(SWT.CENTER, SWT.FILL, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("RIGHT, TOP");
	    b.setLayoutData(new GridData(SWT.RIGHT, SWT.TOP, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("RIGHT, CENTER");
	    b.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("RIGHT, BOTTOM");
	    b.setLayoutData(new GridData(SWT.RIGHT, SWT.BOTTOM, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("RIGHT, FILL");
	    b.setLayoutData(new GridData(SWT.RIGHT, SWT.FILL, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("FILL, TOP");
	    b.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("FILL, CENTER");
	    b.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("FILL, BOTTOM");
	    b.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, true, true, 1, 1));
	    b = new Button(shell, SWT.PUSH);
	    b.setText("FILL, FILL");
	    b.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

	    shell.open();
	    while (!shell.isDisposed()) {
	      if (!display.readAndDispatch())
	        display.sleep();
	    }
	    display.dispose();
	  }
}
