package by.htp.library.controller;

public class ControllerFactory {
	public static final ControllerFactory controllerFactory = new ControllerFactory();
	
	public final FrontController frontController = new FrontController();
	
	public ControllerFactory() {}
	
	public FrontController getFrontController() {
		return frontController;
	}
}
