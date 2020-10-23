import axios from 'axios';

const api = axios.create({
    baseURL: 'https://api.github.com',
});

// api.interceptors.request.use(async config => {
//   const token = process.env.REACT_APP_API_KEY;

//   if (token) config.headers['X-API-KEY'] = token;

//   return config;
// });

export default api;
