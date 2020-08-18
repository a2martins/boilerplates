import DevService from '../services/DevsService';

const findDevs = async () => {
    return await new DevService().find();
}

export default findDevs;
