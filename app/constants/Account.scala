package constants

import play.api.Logger

object Account {

  case class AccountType(name: String, id: Int)

  object Type {
    val CREATOR: AccountType = AccountType("CREATOR", 0)

    val USER: AccountType = AccountType("USER", 1)

    def getAccountType(id: Int)(implicit module: String, logger: Logger): AccountType = id match {
      case 0 => CREATOR
      case 1 => USER
      case _ => constants.Response.ACCOUNT_TYPE_NOT_FOUND.throwBaseException()
    }
  }

  object Key {
    val DEFAULT_NAME = "DEFAULT"
  }

}
