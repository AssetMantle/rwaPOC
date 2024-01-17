package constants

import play.api.Logger

object Account {

  case class AccountType(name: String, id: Int)

  object Type {
    val LISTER: AccountType = AccountType("LISTER", 0)
    val INSTITUTIONAL_INVESTOR: AccountType = AccountType("INSTITUTIONAL_INVESTOR", 1)
    val INDIVIDUAL_INVESTOR: AccountType = AccountType("INDIVIDUAL_INVESTOR", 2)
    val ANALYST: AccountType = AccountType("ANALYST", 3)

    def getAccountType(id: Int)(implicit module: String, logger: Logger): AccountType = id match {
      case 0 => LISTER
      case 1 => INSTITUTIONAL_INVESTOR
      case 2 => INDIVIDUAL_INVESTOR
      case 3 => ANALYST
      case _ => constants.Response.ACCOUNT_TYPE_NOT_FOUND.throwBaseException()
    }

    def getAccountType(name: String)(implicit module: String, logger: Logger): AccountType = name match {
      case LISTER.name => LISTER
      case INSTITUTIONAL_INVESTOR.name => INSTITUTIONAL_INVESTOR
      case INDIVIDUAL_INVESTOR.name => INDIVIDUAL_INVESTOR
      case ANALYST.name => ANALYST
      case _ => constants.Response.ACCOUNT_TYPE_NOT_FOUND.throwBaseException()
    }
  }

  object Key {
    val DEFAULT_NAME = "DEFAULT"
  }

}
