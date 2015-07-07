//
//  Player.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "Player.h"

@implementation Player

-(id)init{
    if(self = [super init]){
        baseStats = [[BaseStats alloc]init];
        skillStats = [[SkillStats alloc]init];
        pointStats = [[PointStats alloc]init];
        hackerPoints = 0;
        status = None;
    }
    return self;
}

// getter methods
-(RepositoryContainer*)getRepositories { return repositories; }
-(BaseStats*)getBaseStats { return baseStats; }
-(SkillStats*)getSkillStats { return skillStats; }
-(PointStats*)getPointStats { return pointStats; }
-(int)getHackerPoints { return hackerPoints; }
-(PlayerStatus)getPlayerStatus { return status; }

// setter methods
-(void)setRepositories:(RepositoryContainer*)value { repositories = value; }
-(void)setBaseStats:(BaseStats*)value { baseStats = value; }
-(void)setSkillStats:(SkillStats*)value { skillStats = value; }
-(void)setPointStats:(PointStats*)value { pointStats = value; }
-(void)setHackerPoints:(int)value { hackerPoints = value; }
-(void)setPlayerStatus:(PlayerStatus)value { status = value; }

@end