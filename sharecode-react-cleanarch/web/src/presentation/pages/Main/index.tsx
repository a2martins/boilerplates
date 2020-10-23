import { Grid } from '@material-ui/core';
import Box from '@material-ui/core/Box';
import Container from '@material-ui/core/Container';
import Link from '@material-ui/core/Link';
import Typography from '@material-ui/core/Typography';
import React, { useEffect, useState } from 'react';
import { useDispatch } from 'react-redux';
import * as GithubActions from '../../../infra/store/action/GithubActions';
import Post from "../../components/Post";

function Copyright() {
  return (
    <Typography variant="body2" color="textSecondary" align="center">
      {'Copyright © '}
      <Link color="inherit" href="https://material-ui.com/">
        Your Website
      </Link>{' '}
      {new Date().getFullYear()}
      {'.'}
    </Typography>
  );
}

// const useStyles = makeStyles((theme) => ({
//   paper: {
//     marginTop: theme.spacing(8),
//     display: 'flex',
//     flexDirection: 'column',
//     alignItems: 'center',
//   },
//   avatar: {
//     margin: theme.spacing(1),
//     backgroundColor: theme.palette.secondary.main,
//   },
//   form: {
//     width: '100%', // Fix IE 11 issue.
//     marginTop: theme.spacing(3),
//   },
//   submit: {
//     margin: theme.spacing(3, 0, 2),
//   },
// }));

const Main = () => {
    
    const dispatch = useDispatch()

    const [data, setData] = useState({})
    const [username, setUsername] = useState("")

    useEffect(() => {
        GithubActions.getbyUsername(username)
          .then(response => setData(response) )
    }, [dispatch, username]);

  return (
    <Container component="main" maxWidth="lg">
      <Box mt={5}>
        <Grid container spacing={4}>
          {data && <Post user={data} />}
        </Grid>
        <Copyright />
      </Box>
    </Container>
  );
}

export default Main
