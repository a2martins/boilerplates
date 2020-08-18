import DevService from '../services/DevsService';

const saveDevs = (github_username:string, techs:string) => {
    return new DevService().store(github_username, techs);
}

export default saveDevs;
