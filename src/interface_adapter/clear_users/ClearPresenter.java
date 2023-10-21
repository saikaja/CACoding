package interface_adapter.clear_users;

import interface_adapter.signup.SignupState;
import interface_adapter.signup.SignupViewModel;
import use_case.clear_users.ClearOutputBoundary;

public class ClearPresenter implements ClearOutputBoundary {

    private final SignupViewModel signupViewModel;
    private final ClearViewModel clearViewModel;

    public ClearPresenter(SignupViewModel signupViewModel, ClearViewModel clearViewModel) {
        this.signupViewModel = signupViewModel;
        this.clearViewModel = clearViewModel;
    }

    @Override
    public void prepareSuccessView(String successMessage) {
        ClearState clearState = clearViewModel.getState();
        clearState.setMessage(successMessage);
        clearViewModel.firePropertyChanged();

    }

    @Override
    public void prepareFailView(String error) {
        ClearState clearState = clearViewModel.getState();
        clearState.setMessage(error);
        clearViewModel.firePropertyChanged();
    }
}
