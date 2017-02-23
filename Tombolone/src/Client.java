import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

public class Client {

	protected Shell shlLaTuaCartellina;
	private Table table;

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
		shlLaTuaCartellina.setSize(459, 379);
		shlLaTuaCartellina.setText("La tua cartellina");
		
		Button btnRicevi = new Button(shlLaTuaCartellina, SWT.NONE);
		btnRicevi.setBounds(10, 10, 115, 37);
		btnRicevi.setText("Ricevi numeri");
		
		Button btnInvia = new Button(shlLaTuaCartellina, SWT.NONE);
		btnInvia.setBounds(372, 294, 61, 37);
		btnInvia.setText("VEDI");
		
		table = new Table(shlLaTuaCartellina, SWT.BORDER | SWT.FULL_SELECTION);
		table.setBounds(25, 79, 361, 123);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(40);
		tblclmnNewColumn.setText("1");
		
		TableColumn tblclmnNewColumn_1 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_1.setWidth(40);
		tblclmnNewColumn_1.setText("2");
		
		TableColumn tblclmnNewColumn_2 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_2.setWidth(39);
		tblclmnNewColumn_2.setText("3");
		
		TableColumn tblclmnNewColumn_3 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_3.setWidth(38);
		tblclmnNewColumn_3.setText("4");
		
		TableColumn tblclmnNewColumn_4 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_4.setWidth(35);
		tblclmnNewColumn_4.setText("5");
		
		TableColumn tblclmnNewColumn_5 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_5.setWidth(43);
		tblclmnNewColumn_5.setText("6");
		
		TableColumn tblclmnNewColumn_6 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_6.setWidth(41);
		tblclmnNewColumn_6.setText("7");
		
		TableColumn tblclmnNewColumn_7 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_7.setWidth(40);
		tblclmnNewColumn_7.setText("8");
		
		TableColumn tblclmnNewColumn_8 = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn_8.setWidth(40);
		tblclmnNewColumn_8.setText("9");

	}
}
