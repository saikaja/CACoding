package use_case.clear_users;

import interface_adapter.clear_users.ClearPresenter;

public class ClearInteractor implements ClearInputBoundary {
    final ClearUserDataAccessInterface clearDataAccessObject;
    final ClearOutputBoundary clearPresenter;

    public ClearInteractor(ClearUserDataAccessInterface clearDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        this.clearDataAccessObject = clearDataAccessInterface;
        this.clearPresenter = clearOutputBoundary;
    }
    @Override
    public void execute() {
        String names = clearDataAccessObject.clear();
        if(!(names.length() == 0)){
            clearPresenter.prepareSuccessView("Successfully deleted - " + names);
        }
        else{
            clearPresenter.prepareFailView("No users found to delete");
        }
    }
}
