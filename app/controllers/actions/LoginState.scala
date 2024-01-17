package controllers.actions

import constants.Account.AccountType

case class LoginState(username: String, address: String, accountType: AccountType) {

  def isCreator: Boolean = this.accountType.id == constants.Account.Type.INSTITUTIONAL_INVESTOR.id || this.accountType.id == constants.Account.Type.INDIVIDUAL_INVESTOR.id

  def getIdentityId: String = utilities.Identity.getMantlePlaceIdentityID(this.username).asString

  def getExplorerUrl: String = s"${constants.CommonConfig.ExplorerUrl}/document/${this.getIdentityId}"

}
