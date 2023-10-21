package use_case.clear_users;

import use_case.signup.SignupOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(String successMessage);

    void prepareFailView(String error);
}
