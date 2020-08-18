import mongoose from 'mongoose';
import '../database/mongo';

const DevSchema = new mongoose.Schema({
    name: String,
    github_username: String,
    avatar_url: String,
    techs: [String]
});

export default mongoose.model('developers', DevSchema);
