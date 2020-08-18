import { Request, Response } from 'express';
import findDevs from '../../usecase/findDevs';
import saveDevs from '../../usecase/saveDevs';

class DevController {
    static async index(req: Request, res: Response) {
        const devs = await findDevs();
        res.status(200).json(devs);
    }

    static async store(req: Request, res: Response) {
        const { github_username, techs } = req.body;
        const devs = await saveDevs(github_username, techs);
        res.status(200).json(devs);
    }
}

export default DevController;
