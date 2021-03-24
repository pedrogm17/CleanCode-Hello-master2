package es.ulpgc.eite.cleancode.helloworld.bye;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.helloworld.bye.ByeViewModel;

public interface ByeContract {

  interface View {
      void navigateToHelloScreen();

      void injectPresenter(Presenter presenter);

    void displayByeData(ByeViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);
    void injectModel(Model model);

    void onResumeCalled();
    void sayByeButtonClicked();
    void goHelloButtonClicked();
  }

  interface Model {

    String getByeMessage();
  }

}