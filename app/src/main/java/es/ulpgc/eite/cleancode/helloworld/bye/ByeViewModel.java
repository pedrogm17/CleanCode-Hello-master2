package es.ulpgc.eite.cleancode.helloworld.bye;


import java.util.Objects;

public class ByeViewModel {

    public String byeMessage = "?";

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        es.ulpgc.eite.cleancode.helloworld.bye.ByeViewModel viewModel = (es.ulpgc.eite.cleancode.helloworld.bye.ByeViewModel) obj;
        return Objects.equals(byeMessage, viewModel.byeMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(byeMessage);
    }

    @Override
    public String toString() {
        return
                "byeMessage: " + byeMessage;
    }
}
