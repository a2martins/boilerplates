import User from '../../../core/domain/User'

const toUserDomainConverter = (username: string): User => {
    let user = new User()
    user.login = username
    return user
}

export default toUserDomainConverter
