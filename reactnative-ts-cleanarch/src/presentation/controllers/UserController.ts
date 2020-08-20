import toUserDomainConverter from './converter/toUserDomainConverter'


export default class UserController {

    findUserGithub = (username: string) => {
        let userDomain = toUserDomainConverter(username)
    }


}
