package shared.loan;

import client.model.loan.loanstates.LoanState;
import client.model.loan.loanstates.NewLoanState;
import shared.materials.Material;
import shared.person.borrower.Borrower;

import java.io.Serializable;

public class Loan implements Serializable
{

//  private int loanID, materialID, copyNumber, numberOfExtensions;
  private LoanState loanState;
  private Material material;
  private Borrower borrower;
  private String deadline, loanDate, returnDate;
  private int loanID;
  private String materialType;
  private static final long serialVersionUID = -1663825955959143816L;
  private boolean materialHasReservation;

  public Loan(Material material, Borrower borrower, String deadline, String loanDate, String returnDate, int loanID)
  {
    if (material == null || borrower == null || deadline == null || loanDate == null || loanID <= 0)
    {
      throw new IllegalArgumentException();
    }

    this.material = material;
    this.borrower = borrower;
    this.deadline = deadline;
    this.loanDate = loanDate;
    this.returnDate = returnDate;
    this.loanID = loanID;
    setLoanState(new NewLoanState());
    materialType = material.getMaterialType();
  }

  public Loan(Material material, Borrower borrower, String deadline, String loanDate, String returnDate, int loanID, LoanState loanstate)
  {
    if (material == null || borrower == null || deadline == null || loanDate == null || loanID <= 0)
    {
      throw new IllegalArgumentException();
    }

    this.material = material;
    this.borrower = borrower;
    this.deadline = deadline;
    this.loanDate = loanDate;
    this.returnDate = returnDate;
    this.loanID = loanID;
    setLoanState(new NewLoanState());
    materialType = material.getMaterialType();
    this.loanState = loanstate;
  }


  public void setLoanState(LoanState loanState)
  {
    this.loanState = loanState;
  }

  public void extendLoan()
  {
    loanState.extendLoan(this);
  }

  public Material getMaterial()
  {
    return material;
  }


  public Borrower getBorrower()
  {
    return borrower;
  }

  public int getLoanID()
  {
    return loanID;
  }

  public String getDeadline()
  {
    return deadline;
  }

  public String getLoanDate()
  {
    return loanDate;
  }

  public String getReturnDate()
  {
    return returnDate;
  }

  public boolean materialHasReservation()
  {
    return materialHasReservation;
  }

  public void setMaterialHasReservation(boolean materialHasReservation)
  {
    this.materialHasReservation = materialHasReservation;
  }

  public LoanState getLoanState()
  {
    return loanState;
  }

  //
//  public void setReturnDate(String returnDate)
//  {
//    this.returnDate = returnDate;
//  }
//
//  public int getLoanID()
//  {
//    return loanID;
//  }
//
//  public int getMaterialID()
//  {
//    return materialID;
//  }
//
//  public int getCopyNumber()
//  {
//    return copyNumber;
//  }
//
//  public int getNumberOfExtensions()
//  {
//    return numberOfExtensions;
//  }
//
//  public String getCpr()
//  {
//    return cpr;
//  }
//
//  public String getLoanDate()
//  {
//    return loanDate;
//  }
//
//  public String getDeadline()
//  {
//    return deadline;
//  }
//
//  public String getReturnDate()
//  {
//    return returnDate;
//  }
//
//  public String getTitle()
//  {
//    return title;
//  }

}
