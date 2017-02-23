import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;

public class Client {

	protected Shell shlLaTuaCartellina;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Client window = new Client();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlLaTuaCartellina.open();
		shlLaTuaCartellina.layout();
		while (!shlLaTuaCartellina.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlLaTuaCartellina = new Shell();
		shlLaTuaCartellina.setSize(576, 517);
		shlLaTuaCartellina.setText("La tua cartellina");
		
		Button btnRicevi = new Button(shlLaTuaCartellina, SWT.NONE);
		btnRicevi.setBounds(10, 10, 115, 37);
		btnRicevi.setText("Ricevi numeri");
		
		Button btnInvia = new Button(shlLaTuaCartellina, SWT.NONE);
		btnInvia.setBounds(489, 432, 61, 37);
		btnInvia.setText("VEDI");

	}

}
