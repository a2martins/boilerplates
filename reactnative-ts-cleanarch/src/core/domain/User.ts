
class User {
    private _login?: string
    private _id?: string
    private _htmlUrl?: string
    private _name?: string
    private _company?: string
    private _location?: string
    private _bio?: string
    private _followers?: string
    private _following?: string
    private _avatarUrl?: string
    private _createdAt?: string

    get login() {
        return this._login
    }

    get id() {
        return this._id
    }

    get htmlUrl() {
        return this._htmlUrl
    }

    get name() {
        return this._name
    }

    get company() {
        return this._company
    }

    get location() {
        return this._location
    }

    get bio() {
        return this._bio
    }

    get followers() {
        return this._followers
    }

    get following() {
        return this._following
    }

    get avatarUrl() {
        return this._avatarUrl
    }

    get createdAt() {
        return this._createdAt
    }


    set login(login: string) {
        this._login = login
    }

}

export default User
