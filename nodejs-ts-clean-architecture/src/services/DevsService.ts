import axios from 'axios';
import Dev from '../repository/models/DevSchema';
import parseStringToArray from './util/parseStringToArray';

export default class DevsService {
    public find = async () => {
        return await Dev.find();
    }

    public store = async (github_username:string, techs:string) => {

        let dev = await Dev.findOne({
            github_username
        });

        if(!dev) {
            const apiRes = await axios.get(`https://api.github.com/users/${github_username}`);

            const { login } = apiRes.data;
            const { name = login, avatar_url, bio } = apiRes.data;

            const techsArray = parseStringToArray(techs);

            return await Dev.create({
                github_username,
                name,
                avatar_url,
                bio,
                techs: techsArray ,
            });

        }
    }
}
