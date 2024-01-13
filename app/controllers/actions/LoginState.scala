package controllers.actions

import constants.Account.AccountType

case class LoginState(username: String, address: String, accountType: AccountType) {

  def isUser: Boolean = this.accountType.id == constants.Account.Type.USER.id

  def isCreator: Boolean = this.accountType.id == constants.Account.Type.CREATOR.id

  def getIdentityId: String = utilities.Identity.getMantlePlaceIdentityID(this.username).asString

  def getExplorerUrl: String = s"${constants.CommonConfig.ExplorerUrl}/document/${this.getIdentityId}"

}
