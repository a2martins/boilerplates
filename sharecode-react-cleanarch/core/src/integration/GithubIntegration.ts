import api from "../service/api";

export class GithubIntegration {
    static getByUsername = async (username: string) => {
        return await api.get(`/users/${username}`)
    }
}


