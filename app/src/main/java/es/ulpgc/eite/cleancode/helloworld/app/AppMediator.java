package es.ulpgc.eite.cleancode.helloworld.app;

import es.ulpgc.eite.cleancode.helloworld.bye.ByeState;
import es.ulpgc.eite.cleancode.helloworld.hello.HelloState;

public class AppMediator {

  private HelloState helloState = new HelloState();
  private ByeState byeState = new ByeState();

  private HelloToByeState helloToByeState;
  private ByeToHelloState byeToHelloState;

  private static AppMediator INSTANCE;

  private AppMediator() {

  }

  public static void resetInstance() {
    INSTANCE = null;
  }

  public static AppMediator getInstance() {
    if(INSTANCE == null){
      INSTANCE = new AppMediator();
    }

    return INSTANCE;
  }

  public HelloState getHelloState() {
    return helloState;
  }

  public HelloToByeState getHelloToByeState() {
    HelloToByeState state = helloToByeState;
    helloToByeState = null;
    return state;
  }

  public void setHelloToByeState(HelloToByeState state) {
    this.helloToByeState = state;
  }

  public ByeToHelloState getByeToHelloState() {
    ByeToHelloState state = byeToHelloState;
    byeToHelloState = null;
    return state;
  }

  public void setByeToHelloState(ByeToHelloState state) {
    this.byeToHelloState = state;
  }

    public ByeState getByeState() {
      return byeState;
    }
}
