import { Github } from "app-core/dist";

export const getbyUsername = async (username: string) => {
  return await new Github().getByUsername("a2martins")
}
