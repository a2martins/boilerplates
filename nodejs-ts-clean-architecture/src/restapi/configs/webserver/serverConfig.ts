import compression from 'compression'
import cors from 'cors'
import express from 'express'
import helmet from 'helmet'
import http from 'http'
import routes from './routes'
// import swaggerUi from 'swagger-ui-express'
// import swaggerSpecs from './swagger.json'

export default class ServerConfig {
    private server: express.Express;

    constructor() {
        this.server = express()

        this.server.use(express.json())
        this.server.use(express.urlencoded({ extended: false }))
        this.server.use(compression())
        this.server.use(helmet())

        this.server.use(cors())

        // try {
        //     this.server.use('/swagger', swaggerUi.serve, swaggerUi.setup(swaggerSpecs))
        // } catch (err) {
        //     console.error('Unable to read swagger.json', err)
        // }

        this.server.use(routes)
    }

    public createHTTP() {
        return http.createServer(this.server);
    }
}
