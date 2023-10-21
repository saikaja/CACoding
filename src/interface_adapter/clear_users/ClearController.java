package interface_adapter.clear_users;

import use_case.clear_users.ClearInputBoundary;

public class ClearController {
    final ClearInputBoundary usersClearUseCaseInteractor;
    public ClearController(ClearInputBoundary usersClearUseCaseInteractor) {
        this.usersClearUseCaseInteractor = usersClearUseCaseInteractor;
    }
    public void execute() {
        usersClearUseCaseInteractor.execute();
    }
}


