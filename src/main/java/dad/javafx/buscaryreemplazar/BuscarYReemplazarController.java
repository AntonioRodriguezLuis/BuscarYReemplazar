package dad.javafx.buscaryreemplazar;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class BuscarYReemplazarController extends Application {


	private TextField buscarText, reemplazarText;
	private CheckBox mayusYMinusChkBox, buscarChkBox, expresionChkBox, resaltarChkBox;
	private Button buscarButton, reemplazarButton, reemplazarTodoButton, cerrarButton, ayudaButton;

	@Override
	public void start(Stage primaryStage) throws Exception {

		// textField
		buscarText = new TextField();
		reemplazarText = new TextField();

		// checkBox
		mayusYMinusChkBox = new CheckBox("Mayúsculas y minúsculas");
		buscarChkBox = new CheckBox("Buscar hacia atrás");
		expresionChkBox = new CheckBox("Expresión regular");
		resaltarChkBox = new CheckBox("Resaltar resultados");

		// button
		buscarButton = new Button("Buscar");
		reemplazarButton = new Button("Reemplazar");
		reemplazarTodoButton = new Button("Reemplazar todo");
		cerrarButton = new Button("Cerrar");
		ayudaButton = new Button("Ayuda");
		
		buscarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarButton.setMaxWidth(Double.MAX_VALUE);
		reemplazarTodoButton.setMaxWidth(Double.MAX_VALUE);
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		ayudaButton.setMaxWidth(Double.MAX_VALUE);
		

		GridPane root = new GridPane();
		root.setPadding(new Insets(5));
		root.setHgap(5);
		root.setVgap(5);
//		root.setGridLinesVisible(true);
		root.addRow(0, new Label("Buscar:"), buscarText);
		root.addRow(1, new Label("Reemplazar con:"), reemplazarText);
		root.add(mayusYMinusChkBox, 1, 2);
		root.add(buscarChkBox, 2, 2);
		root.add(expresionChkBox, 1, 3);
		root.add(resaltarChkBox, 2, 3);
		root.add(buscarButton, 3, 0);
		root.add(reemplazarButton, 3, 1);
		root.add(reemplazarTodoButton, 3, 2);
		root.add(cerrarButton, 3, 3);
		root.add(ayudaButton, 3, 4);

		ColumnConstraints[] cols = { new ColumnConstraints(), new ColumnConstraints(), new ColumnConstraints(), };
		root.getColumnConstraints().setAll(cols);

//		 restricciones columna 2
		cols[2].setHgrow(Priority.ALWAYS);
		cols[2].setFillWidth(true);

		
		GridPane.setColumnSpan(buscarText, 2); 
		GridPane.setColumnSpan(reemplazarText, 2);
		

		Scene scene = new Scene(root, 640, 200);

		primaryStage.setTitle("Buscar y reemplazar");
		primaryStage.setScene(scene);
		primaryStage.show();

	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
