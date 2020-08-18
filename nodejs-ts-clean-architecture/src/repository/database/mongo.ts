import mongoose from 'mongoose';

mongoose.connect('mongodb+srv://omnistack:omnistack@semanaomnistack10-itzyu.mongodb.net/week10?retryWrites=true&w=majority', {
    useNewUrlParser: true,
    useUnifiedTopology: true,
    useCreateIndex: true
});
