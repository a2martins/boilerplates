import { GithubIntegration } from "../integration";

export class Github {
  getByUsername = async (username: string) => {
    let { data } = await GithubIntegration.getByUsername(username)

    console.log(data)

    return data
  }

}
