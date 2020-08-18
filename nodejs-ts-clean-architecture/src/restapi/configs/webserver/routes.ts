import { Request, Response, Router } from 'express';
import DevController from '../../controllers/DevController';

const routes = Router();

routes.get('/health', (req: Request, res: Response) => {
    req;
    res.json({ status: 'OK' });
});

routes.get('/developers', DevController.index);

routes.post('/developers', DevController.store);

export default routes;
