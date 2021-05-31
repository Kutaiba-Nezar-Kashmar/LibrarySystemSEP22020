package client.view.main;

import client.model.user.UserModelClient;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

//Kutaiba
public class MainVM
{

  private StringProperty passwordProperty;
  private StringProperty cprProperty;
  private UserModelClient userModel;

  public MainVM(UserModelClient userModel)
  {
    passwordProperty = new SimpleStringProperty();
    cprProperty = new SimpleStringProperty();
    this.userModel = userModel;
  }

  public StringProperty passwordProperty()
  {
    return passwordProperty;
  }

  public StringProperty cprProperty()
  {
    return cprProperty;
  }

  public boolean login()
  {
    return userModel
        .borrowerLogin(cprProperty.get(), passwordProperty.get());
  }
}
